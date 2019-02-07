package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Calculator;

/**
 * Servlet implementation class SubtractServlet
 */
@WebServlet("/SubtractServlet")
public class SubtractServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubtractServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int input1 = Integer.parseInt(request.getParameter("userInput1"));
		int input2 = Integer.parseInt(request.getParameter("userInput2"));
		int result = Calculator.subtract(input1, input2);
		request.setAttribute("userSubtract", result);
		request.setAttribute("input1", input1);
		request.setAttribute("input2", input2);
		getServletContext().getRequestDispatcher("/subtractResult.jsp").forward(request, response);
	}

}
