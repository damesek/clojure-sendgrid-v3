# clojure-sendgrid-v3
Example code for sendgrid V3 API with clojure

Authorization example. I used clj-http.client (:as http) and clojure.data.json (:as json) library for this. If you would like to send out `text/html` newsletter/ email out, just change type of the content and add to value a html content.
*The html version*

```
            .....
            [clj-http.client :as http]
            [clojure.data.json :as json]
            .....
            
(def queryhtml "<html><p><b>Hello, world!</b></p></html>")

(http/post "https://api.sendgrid.com/v3/mail/send"
             {:content-type "application/json"
              :headers {:Authorization "Bearer YOUR KEY HERE"} 
              :body (json/write-str {:personalizations [{:to [{"email" "your@emailaddress.com"}]}]
			  						:from    {"email" "from@email.com"}
			  						:subject  "test"
			  						:content [{:type "text/html" 
			  								     :value  queryhtml}]
			  								   })   
             })
```
Test your sender configuration with mail-tester.com.
