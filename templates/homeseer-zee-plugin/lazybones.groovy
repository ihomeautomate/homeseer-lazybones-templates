import org.apache.commons.io.FileUtils
import org.apache.commons.io.FilenameUtils

import static java.util.UUID.randomUUID 
import static org.apache.commons.io.FilenameUtils.concat

def projectGuid = randomUUID() as String
projectGuid.toUpperCase()
def solutionGuid = randomUUID() as String
solutionGuid.toUpperCase()
 
def props = [:]
props.group = ask("Define value for 'group' [org.example]: ", "org.example", "group")
props.version = ask("Define value for 'version' [0.1]: ", "0.1", "version")
props.pluginName = ask("Define value for 'pluginName' [MyPlugin]: ", "MyPlugin", "pluginName")
props.pluginDescription = ask("Define value for 'pluginDescription' [My Plugin]: ", "My Plugin", "pluginDescription")
props.vendor = ask("Define value for 'vendor' [a-vendor]: ", "a-vendor", "vendor")
props.vendorUrl = ask("Define value for 'vendorUrl' [http://www.a-vendor.org]: ", "http://www.a-vendor.org", "vendorUrl")
props.versionNoSnapshot = props.version.minus('-SNAPSHOT')
props.projectGuid ="{${projectGuid}}"
props.solutionGuid ="{${solutionGuid}}"

processTemplates "Properties/AssemblyInfo.cs", props
processTemplates "gradle/artifactory.gradle", props
processTemplates "gradle/bintray.gradle", props
processTemplates "gradle/publishing.gradle", props
processTemplates "build.gradle", props
processTemplates "gradle.properties", props
processTemplates "HSPI_PluginName.cs", props
processTemplates "HSPI_PluginName.csproj", props
processTemplates "HSPI_PluginName.sln", props
processTemplates "README.md", props

def filenamePrefix = "HSPI_" + props.pluginName
def destFileCs = new File(projectDir, filenamePrefix + ".cs")
def destFileCsProj = new File(projectDir, filenamePrefix + ".csproj")
def destFileSln = new File(projectDir, filenamePrefix + ".sln")

FileUtils.moveFile(new File(templateDir, "HSPI_PluginName.cs"), destFileCs)
FileUtils.moveFile(new File(templateDir, "HSPI_PluginName.csproj"), destFileCsProj)
FileUtils.moveFile(new File(templateDir, "HSPI_PluginName.sln"), destFileSln)