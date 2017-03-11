(http/post "https://api.sendgrid.com/v3/mail/send"
             {:content-type "application/json"
              :headers {:Authorization "Bearer YOUR_AUTH_KEY"} 
              :body (json/write-str {:personalizations [{:to [{"email" "your@example.com"}]}]
			  						:from    {"email" "test@example.com"}
			  						:subject  "test"
			  						:content [{:type "text/plain" 
			  								     :value "Heya!!"}]
			  								   })   
             })
