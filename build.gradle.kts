plugins {
   id("us.ihmc.ihmc-build")
   id("us.ihmc.ihmc-ci") version "7.4"
   id("us.ihmc.ihmc-cd") version "1.21"
}

ihmc {
   group = "us.ihmc"
   version = "0.1.1"
   vcsUrl = "https://github.com/ihmcrobotics/ihmc-javafx-extensions"
   openSource = true
   
   configureDependencyResolution()
   configurePublications()
}

mainDependencies {
   api("us.ihmc:euclid:0.17.2")
}

