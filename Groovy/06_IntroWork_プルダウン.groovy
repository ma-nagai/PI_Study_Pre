@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

@Grab('org.seleniumhq.selenium:selenium-support:*')

import geb.Browser

Browser.drive {

    go 'file:///D:/Temp/handson/introWork/introWork_プルダウン.html'
    
    //プルダウンから"2"を選択

    

}