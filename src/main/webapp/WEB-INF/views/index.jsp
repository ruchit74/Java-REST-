<%-- <%@include file="/WEB-INF/views/taglibs.jsp"  %> --%>
<!DOCTYPE html>
<html>
<head>
	<link rel ="stylesheet" href = "https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"  />
 <link rel ="stylesheet" href = "../test5/resources/css/main.css" type="text/css"  />
<!-- <meta name="viewport" content="width=device-width, initial-scale=1" charset="UTF-8"> -->
  	<title>Planet Payments</title>
  	<script src="https://code.jquery.com/jquery-3.1.0.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  	
<script src="/test5/resources/js/main.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="input-group" id="adv-search">
					<input type="text" class="form-control"
						placeholder="Press Dropdown To Proceed" />
					<div class="input-group-btn">
						<div class="btn-group" role="group">
							<div class="dropdown dropdown-lg">
								<button type="button" class="btn btn-default dropdown-toggle"
									data-toggle="dropdown" aria-expanded="false">
									<span class="caret"></span>
								</button>
								<div class="dropdown-menu dropdown-menu-right" role="menu">
									<form class="form-horizontal"  action="${pagecontext.request.contextpath}/test5/search/api/getSearchResult" method="post">
										<div class="form-group">
											<label for="filter">Filter by</label> <select
												class="form-control" id="select">

												<option value="0">Cardholder Name</option>
												<option value="1">Card Last 4 Digits</option>
											</select>
										</div>
										<div class="form-group" id="option1">
											<label for="contain">Enter Cardholder Name</label> 
											<input class="form-control" type="text"  id="cardname"/>
										</div>
										<input type="hidden" value="" name="userdetails">
										<div class="form-group" id="option2" style="display: none;">
											<label for="contain">Enter Last 4 Digits Of Card</label>
											 <input class="form-control" type="text" maxlength="4" id="carddigits"  />
										</div>
										<button type="submit" class="btn btn-primary" id="submit">
											<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
										</button>
									</form>
								</div>
							</div>

						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>