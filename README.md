
Dispatch servlet act as front controller for spring based web application
dispatch nothing but http request processor
It is inherited from HTTPSErverlet
This is configured in web.xml

Only the root application context loaded by ContextLoaderListener


Initially user request will come to Dispatchservlet and it is sent to Handlermapping(Handler mapping has the list of mapping have created, example: Account Number Search...)
While hitting the request, HandlerMapping just add mapping to the Controller. But HandlerAdopter will route the request to the Controller.
From the controller, we are writing logic and return list/data by using JPA repositoy or Hibernet.

Whatever we are returning list/data, we have to set over the Model(Nothing but POJO class) and displayed back to View by using ViewResolver(which is dispatchservlet user)

Refer: https://www.youtube.com/watch?v=FlIJq9GlLWo
