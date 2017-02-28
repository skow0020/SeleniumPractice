require 'fileutils'

source = "C:\\Users\\Colin\\Desktop\\Cucumber_Selenium\\selcucumber\\target\\cucumber"
browsers = ['explorer', 'firefox', 'chrome']

browsers.each do |browser|
  destination = "C:\\Users\\Colin\\Desktop\\Cucumber_Selenium\\selcucumber\\results\\#{browser}"

  puts "Running tests"
  runcmd = "mvn clean test -Denv.BROWSER=#{browser}"
  puts runcmd
  system(runcmd)

  FileUtils.copy_entry source, destination
end
