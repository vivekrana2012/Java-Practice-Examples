package com.fileToDBOps;

import java.nio.file.Path;
import java.util.List;

public interface Reader {
    public List<EmployeeRecord> read(Path path);
}
