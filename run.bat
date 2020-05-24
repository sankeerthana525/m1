set projectLocation=C:\Users\SANKEERTHANA\eclipse-workspace\ol_MFW01
cd %projectLocation%
set Classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectlocation%\testng.xml