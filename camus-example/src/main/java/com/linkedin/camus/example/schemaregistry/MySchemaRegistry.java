package com.linkedin.camus.example.schemaregistry;

import org.apache.avro.Schema;
import org.apache.hadoop.conf.Configuration;

import com.linkedin.camus.example.records.DummyLog;
import com.linkedin.camus.example.records.DummyLog2;
import com.linkedin.camus.schemaregistry.MemorySchemaRegistry;

/**
 * This is a little dummy registry that just uses a memory-backed schema
 * registry to store two dummy Avro schemas. You can use this with
 * camus.properties
 */
public class MySchemaRegistry extends MemorySchemaRegistry<Schema> {
	public MySchemaRegistry(Configuration conf) {
		super();
		super.register("TK_TEST01", DummyLog.newBuilder().build().getSchema());
	}
}
