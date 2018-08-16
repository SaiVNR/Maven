<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.epam.teja.parking_operations.*"%>
<%@ page import="com.epam.teja.file_operations.*"%>
<%@ page import="java.util.HashMap"%>
<%@ page import="java.util.Map.Entry"%>

<html lang="en">
<head>
<title>Login V1</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="images/icons/favicon.ico" />
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->
<SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</SCRIPT>
<style type="text/css">
thead, tbody {
	display: block;
}

tbody {
	height: 150px; /* Just for the demo          */
	overflow-y: auto; /* Trigger vertical scroll    */
	overflow-x: hidden; /* Hide the horizontal scroll */
}
</style>
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">

				<span style="width: 100%;" class="login101-form-title" align="right">
					<a href="Logout">Logout</a>
				</span> <span class="login100-form-title"> Auto Parking Application</span>
				<div align="left">
					<form action="HomeServlet" method="post"
						class="login100-form validate-form">
						<span class="login100-form-title"> Choose Your Option </span>
						<table>
							<tr>
								<td>
									<div class="wrap-input100 validate-input">
										<input type="radio" name="choice" value="park" checked>
										Park
									</div>
								</td>
							</tr>
							<tr>
								<td>
									<div class="wrap-input100 validate-input">
										<input type="radio" name="choice" value="unpark">
										Unpark
									</div>
								</td>
							</tr>
						</table>

						<div class="wrap-input100" data-validate="CarNumber is required">
							<input class="input100" type="text" name="carNumber"
								placeholder="Enter Car Number"> <span
								class="focus-input100"></span>
						</div>
						<div id="content">
							<%
								String output = (String) request.getAttribute("status");
								if (output != null) {
									out.println(output);
								}
							%>
						</div>
						<div class="container-login100-form-btn">
							<button class="login100-form-btn">Go..</button>
						</div>
					</form>
				</div>
				<div align="right">
					<span class="login100-form-title"> Lobby Details </span>
					<table class="table table-bordered">
						<tr>

							<th>Slot Number</th>
							<th>Car Number</th>
							<%
							 /* String filePath = "C:\\Users\\Sai Teja\\workspace\\AutoParkingWeb\\src\\main\\resources\\details.txt";
							 DataOperationServices dataOperationServices = new DataOperationServices();
					         ParkingOperations parkingOperations = null;
							 int slotsCount = dataOperationServices.getCountOfSlots(filePath);
							 if (slotsCount == 0) {
						            parkingOperations = ParkingOperations.getInstance(5);
						        } else {
						            parkingOperations = ParkingOperations.getInstance(slotsCount);
						            dataOperationServices.initializeSlots(filePath);
						        } */
								java.util.Map<String, Integer> parkedCarDetails = com.epam.teja.parking_operations.ParkingOperations
										.getCarsInParkingArea();
								if (parkedCarDetails != null) {
									java.util.TreeMap<Integer, String> details = new java.util.TreeMap<Integer, String>();
									for (java.util.Map.Entry<String, Integer> entry : parkedCarDetails.entrySet()) {
										details.put(entry.getValue() + 1, entry.getKey());
									}
									out.println("<left>Total cars in Lobby " + parkedCarDetails.size() + "</left>");
									for (java.util.Map.Entry<Integer, String> entry : details.entrySet()) {
							%>
						
						<tr>

							<td>
								<%
									out.println(entry.getKey());
								%>
							</td>
							<td>
								<%
									out.println(entry.getValue());
								%>
							</td>

						</tr>
						<%
							}
							}
						%>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</div>




	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/tilt/tilt.jquery.min.js"></script>
	<script>
		$('.js-tilt').tilt({
			scale : 1.1
		})
	</script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>