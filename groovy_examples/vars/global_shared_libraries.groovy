import java.io.*;
import groovy.io.*;

def dir = new File("/Users/lucerogarcia/Documents/groovy_examples");

new File(dir.path + File.separator + "releasenotes.txt").withWriter('utf-8')
{
    writer ->
    dir.eachFileRecurse(FileType.ANY){ file ->
    writer.writeLine(file.name + '\t'+file.length())
    }
}