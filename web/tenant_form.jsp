<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Verify Me</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- Plugin CSS -->
    <link href="vendor/magnific-popup/magnific-popup.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template -->
    <link href="css/freelancer.min.css" rel="stylesheet">
    <link href="css/custom.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    
    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>


  </head>

  <body id="page-top">
      
      <!-- Navigation -->
    <nav class="navbar navbar-expand-lg bg-secondary fixed-top text-uppercase" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="index.jsp">Verification</a>
        <button class="navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="dropdown nav-item mx-0 mx-lg-1" id="navFilter">
              <div class="dropdown">
                <a class="nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger dropbtn">Join</a>
                <div class="dropdown-content">
                  <a href="owner.jsp">Homeowner</a>
                  <a href="tenant.jsp">Tenant</a>
                </div>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <div class="tenant_form" style="margin-top: 100px;">
        <form>
          <div class="container">
              <!-- <div class="container-fluid"> -->
              <h2 style="margin: 0px; text-align: center;"><img src="image/dmp.png" height="60px" width="60px"> Metropolitan Police</h2>

              <div class="col-md-12 col-sm-12" style=" ">
                  <div class="col-md-4 col-sm-4  col-md-offset-5" > 
                    <img src="images/male.png" class="img-responsive" alt="" width="200" height="200">
                    <input type="file" name="" >
                  </div>

                  <div class="col-md-3 col-sm-4 form-group">
                      <table class="table" style="margin-top: 10px;">
                          <tr>
                              <td class="">Division </td>
                              <td><input class="form-control" type="" name=""></td>
                          </tr>

                          <tr>
                              <td>Thana </td>
                              <td><input class="form-control " type="" name=""></td>
                          </tr>
                      </table>
                  </div>
              </div>

          </div> <!-- /container -->

          <div class="container form-group" style="padding: 25px;">
              <div class="col-md-12 col-sm-12">
                <h3><u>Tenant Registration Form </u></h3>
                  <table>
                      <tr>
                          <td>1. Tenant Name: </td>
                          <td><input class="form-control col-md-12 col-sm-12" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>2. Father's Name: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>

                      <tr>
                          <td>3. Date of Birth: </td>
                          <td><input class="form-control col-md-12 col-sm-12" type="date" name=""></td>
                          <td> Marital Status: </td>
                          <td>
                            <select class=" col-md-12 col-sm-12" name="">
                              <option class="form-control" value=""> Married </option>
                              <option class="form-control" value=""> Unmarried </option>
                            </select>
                          </td>
                      </tr>

                      <tr>
                          <td>4. Permanent Address: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>5. Profession / Work Place: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>6. Religion: </td>
                          <td><input class="form-control" type="" name=""></td>
                          <td>Educational Qualification: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>7. Contact No: </td>
                          <td><input class="form-control" type="" name=""></td>
                          <td>Email Address: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>8. National ID No: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>9. Passport No: </td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>10. Emergency Contact: </td>
                          <table>
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>(a)</td><td>Name: </td><td><input class="form-control" type="" name=""></td>
                                          <td>(b)</td><td>Relations: </td><td><input class="form-control" type="" name=""></td>
                                      </li>
                                  </ul>
                              </tr>
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>(c)</td><td>Address: </td><td><input class="form-control" type="" name=""></td>
                                          <td>(d)</td><td>Contact No: </td><td><input class="form-control" type="" name=""></td>
                                      </li>
                                  </ul>
                              </tr>
                          </table>
                      </tr>
                      <tr>
                          <td>11. Other Member: </td>
                          <table border="1px">
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>Sl </td><td>Name </td><td>Age</td>
                                          <td>Profession</td><td>Contact No</td>
                                      </li>
                                  </ul>
                              </tr>
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>i)</td>
                                          <td><input class="form-control" type="" name=""> </td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                      </li>
                                  </ul>
                              </tr>
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>ii)</td>
                                          <td><input class="form-control" type="" name=""> </td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                      </li>
                                  </ul>
                              </tr>
                              <tr>
                                  <ul style="list-style-type:none">
                                      <li>
                                          <td>iii)</td>
                                          <td><input class="form-control" type="" name=""> </td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                          <td><input class="form-control" type="" name=""></td>
                                      </li>
                                  </ul>
                              </tr>
                          </table>
                      </tr>

                      <tr> . </tr>

                      <tr>
                          <table class="">
                              <tr>
                                  <td>12.</td>
                                  <td>Maid's Name: </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td>National ID No: </td>
                                  <td><input class="form-control" type="" name=""></td>
                              </tr>
                              <tr>
                                  <td></td>
                                  <td>Contact No: </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td>Permanent Address: </td>
                                  <td><input class="form-control" type="" name=""></td>
                              </tr>
                          <!-- </table>
                      </tr>
                      <tr>
                          <table> -->
                              <tr>
                                  <td>13.</td>
                                  <td>Driver's Name: </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td>National ID No: </td>
                                  <td><input class="form-control" type="" name=""></td>
                              </tr>
                              <tr>
                                  <td></td>
                                  <td>Contact No: </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td>Permanent Address: </td>
                                  <td><input class="form-control" type="" name=""></td>
                              </tr>
                          <!-- </table>
                      </tr>
                      <tr>
                          <table> -->
                              <tr>
                                  <td>১৪.</td>
                                  <td>পূর্ববর্তী বাড়িওয়ালার নামঃ </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td>মোবাইল নম্বরঃ</td>
                                  <td><input class="form-control" type="" name=""></td>
                              </tr>
                              <tr>
                                  <td></td>
                                  <td>ঠিকানাঃ </td>
                                  <td><input class="form-control" type="" name=""></td>
                                  <td></td>
                                  <td></td>
                              </tr>
                          <!-- </table>
                      </tr>
                  </table>
                  <table> -->
                      <tr>
                          <td>১৫.</td>
                          <td>পূর্ববর্তী বাসা ছাড়ার কারণঃ</td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>১৬.</td>
                          <td>বর্তমান বাড়িওয়ালার নামঃ</td>
                          <td><input class="form-control" type="" name=""></td>
                          <td>মোবাইল নাম্বারঃ</td>
                          <td><input class="form-control" type="" name=""></td>
                      </tr>
                      <tr>
                          <td>১৭.</td>
                          <td>বর্তমান বাড়িতে কত তারিখ <br> থেকে বসবাসঃ</td>
                          <td><input class="form-control" type="date" name=""></td>
                      </tr>
                  </table>
              </div>
          </div>
      </form>
    </div>

      
    <footer class="footer text-center">
      <div class="container">
        <div class="row">
          <div class="col-md-6 mb-5 mb-lg-0">
            <h4 class="text-uppercase mb-4">Location</h4>
            <p class="lead mb-0" style="color: white;">Dhanmondi 4/A
              <br>House #41 Block NULL</p>
          </div>
          <div class="col-md-6 mb-5 mb-lg-0">
            <h4 class="text-uppercase mb-4">Around the Web</h4>
            <ul class="list-inline mb-0">
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-facebook"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-google-plus"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-twitter"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-linkedin"></i>
                </a>
              </li>
              <li class="list-inline-item">
                <a class="btn btn-outline-light btn-social text-center rounded-circle" href="#">
                  <i class="fa fa-fw fa-dribbble"></i>
                </a>
              </li>
            </ul>
          </div>
          
        </div>
      </div>
    </footer>

    <div class="copyright py-4 text-center text-white">
      <div class="container">
        <small>Copyright &copy; BD Police 2018</small>
      </div>
    </div>
      
      
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>
    <script src="vendor/magnific-popup/jquery.magnific-popup.min.js"></script>

    <!-- Contact Form JavaScript -->
    <script src="js/jqBootstrapValidation.js"></script>
    <script src="js/contact_me.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/freelancer.min.js"></script>
  </body>
<script type="text/javascript">
//auto expand textarea
function adjust_textarea(h) {
    h.style.height = "20px";
    h.style.height = (h.scrollHeight)+"px";
}
</script>
</html>