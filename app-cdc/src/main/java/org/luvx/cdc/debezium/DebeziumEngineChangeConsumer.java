package org.luvx.cdc.debezium;

import io.debezium.engine.DebeziumEngine;
import io.debezium.engine.RecordChangeEvent;
import org.apache.kafka.connect.source.SourceRecord;

import java.util.List;

/**
 * @author: Ren, Xie
 */
public class DebeziumEngineChangeConsumer implements DebeziumEngine.ChangeConsumer<RecordChangeEvent<SourceRecord>> {
    @Override
    public void handleBatch(List<RecordChangeEvent<SourceRecord>> list, DebeziumEngine.RecordCommitter<RecordChangeEvent<SourceRecord>> recordCommitter)
            throws InterruptedException {

    }
}
