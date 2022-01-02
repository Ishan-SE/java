
# Zip file stream

Zip files are the archives that store one or more files in compressed form.The java.util.zip contains the classes for working with zip files.Each zip files has a header which includes information like name of the file and the compression method used like GZIP and ZIP.ZipInputStream() is used to read a Zip file by layering the zipInputSream constructor on to a FileInputStream().We then need to look at the individual entries in the archive .The getNextEntry() methid returns an object of tyoe zipEntry that sescribes the entry.The read methos of the ZipInputStream is modified to return -1 ta the end of the current entry.  


