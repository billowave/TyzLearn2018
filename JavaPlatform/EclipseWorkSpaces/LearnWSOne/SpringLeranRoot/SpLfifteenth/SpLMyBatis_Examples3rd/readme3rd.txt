SpringLeranRoot

   SpLfifteenth
          SpLMyBatis_Examples3rd
               Java Maven web 项目
                    	
配置正确<property name="mapperLocations" value="classpath*:mapper/*.xml" />

配置报错<property name="mapperLocations" value="classpath*:*.xml" />

等于有mapper用文件夹隔离了，否则又把相同的xml读取一边，N循环了

配置文件错误报错【重复读取了同样的xml文件造成了相同的bean产生】

org.xml.sax.SAXParseException; lineNumber: 7; columnNumber: 120; 
文档根元素 "beans" 必须匹配 DOCTYPE 根 "null"

                    
          



















        		