package controller;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class DivideServlet
 */
@WebServlet("/DivideServlet")
public class DivideServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DivideServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DecimalFormat df = new DecimalFormat("0.0000");
		double input1 = Double.parseDouble(request.getParameter("userInput1"));
		double input2 = Double.parseDouble(request.getParameter("userInput2"));
		double result = Double.parseDouble(df.format(Calculator.divide(input1, input2)));
		request.setAttribute("userDivide", result);
		request.setAttribute("input1", input1);
		request.setAttribute("input2", input2);
		getServletContext().getRequestDispatcher("/divideResult.jsp").forward(request, response);
	}

}
