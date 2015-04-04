@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   
   go 'file:///D:/Temp/handson/introWork/Introwork_”’l.html'
   
   //Å‘å’l
   assert $("p").max { it.text() }.text() == "5"
   //Å¬’l
   assert $("p").min { it.text() }.text() == "1"
   
   
}