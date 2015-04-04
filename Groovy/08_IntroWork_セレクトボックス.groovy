@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

@Grab('org.seleniumhq.selenium:selenium-support:*')

import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/Introwork_セレクトボックス.html'
   
    //単体選択


    sleep(3000)
    
    //複数選択

    
    

    

}