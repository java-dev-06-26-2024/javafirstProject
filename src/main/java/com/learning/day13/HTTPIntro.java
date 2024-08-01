package com.learning.day13;

public class HTTPIntro {

    public static void main(String[] args) {
        // HTTP protocol : Hyper Text Transfer Protocol.
       //	                   request, response

        //	 HTTP Request : 4 major parts
//	 1. Method / verb  -> This is used to indicate the type of request to the receiving applicstion
//	              HTTP verb Restful Conventions:
//	                       1. GET     -> used to request the information from server. rarely contains any information in the body.
//	                       2. POST    -> send the new information to the server , usually to be persisted. (create new records)
//	                       3. PUT     -> use to update the exiting full information ( entire entity) on server. (update new records)
//	                       4. PATCH   -> Updates a specific part of a resource on the server.
//	                                    -> not part of original HTTP 1.0 protocol.
//	                       5. DELETE  -> Removes a resource from the server.
//	 2. Location -> (URL/IP address ) from where the request is going
//	 3. Header   -> header contains the metadata about the request to help it to be processed. Cookies are held in the headers of request
//	 4. Body     -> Contains any information that server will need to fulfill the request.
//
// 	 HTTP Response : 3 major parts
//	 1.Header       -> contains metadatsa about response. sometimes cookies to be sent with followup reques. browser will automatically handle these.
//	 2. Body        -> contains the actual data requested.
//	 3. Status Code -> there a 5 different levels of status codes. each code had specific meaning.
//	                     1xx: informational
//	                                ▪ 101: switching protocols.
//	                     2xx: success
//	                                ▪ 200: OK
//	                                ▪ 201: Created
//	                                ▪ 202: Accepted
//	                                ▪ 204: No Content
//	                     3xx: redirects
//	                                ▪ 301: Moved Permanently
//                              	▪ 307: Temporary Redirect
//	                     4xx: Client-side errors (Something in the request is wrong)
//	                                ▪ 400: Bad Request
//	                                ▪ 401: Unauthorized
//	                                ▪ 403: Forbidden
//	                                ▪ 404: Not Found
//	                                ▪ 418: I’m a teapot (not a coffee maker) - This indicates the request is attempting
//	                                        to do something the server is not intended to provide.
//	                                ▪ 420: Enhance your calm - (Twitter specific) Too many requests were sent by
//	                                       client in a short period of time.
//	                     5xx: Server-side errors:
//	                                ▪ 500: Internal Server Error
//	                                ▪ 501: Not Implemented
//	                                ▪ 502: Bad Gateway
//	                                ▪ 504: Gateway Timeout
//	o Http.cat is a great website for visualizing the status codes.


    }
}
