def call(String mavenGoal){
  
  if ("${mavenGoal}" == "Clean")
     {
       sh "mvn clean package"
     }
  else if ("${mavenGoal}" == "Compile")
     {
       sh "mvn clean compile"
     }
  else if ("${mavenGoal}" == "Test")
     {
       sh "mvn clean test"
     }
}
