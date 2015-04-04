@Grab('org.gebish:geb-core')
@Grab('org.seleniumhq.selenium:selenium-firefox-driver')

import geb.Browser

Browser.drive {
   //URLをコピペするときは円マークをスラッシュに直すこと！
   go 'file:///D:/Temp/handson/introWork/introWork_文字列入力(name).html'
   
   assert title == 'IntroWork1_C'
  
   //name指定で要素取得

   
   
}