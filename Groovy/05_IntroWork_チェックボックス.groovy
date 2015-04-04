@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/introWork_チェックボックス.html'
    
    //チェックをつける
    
    
    sleep(1000)
    
    //チェックを外す
    

}