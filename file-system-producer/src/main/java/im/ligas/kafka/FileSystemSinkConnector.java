package im.ligas.kafka;

import java.util.List;
import java.util.Map;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.sink.SinkConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileSystemSinkConnector extends SinkConnector {
  private static Logger log = LoggerFactory.getLogger(FileSystemSinkConnector.class);
  private FileSystemSinkConnectorConfig config;

  @Override
  public String version() {
    return VersionUtil.getVersion();
  }

  @Override
  public void start(Map<String, String> map) {
    config = new FileSystemSinkConnectorConfig(map);

    //TODO: Add things you need to do to setup your connector.

    /**
     * This will be executed once per connector. This can be used to handle connector level setup.
     */

  }

  @Override
  public Class<? extends Task> taskClass() {
    //TODO: Return your task implementation.
    return FileSystemSinkTask.class;
  }

  @Override
  public List<Map<String, String>> taskConfigs(int maxTasks) {
    //TODO: Define the individual task configurations that will be executed.

    /**
     * This is used to schedule the number of tasks that will be running. This should not exceed maxTasks.
     */

    throw new UnsupportedOperationException("This has not been implemented.");
  }

  @Override
  public void stop() {
    //TODO: Do things that are necessary to stop your connector.
  }

  @Override
  public ConfigDef config() {
    return FileSystemSinkConnectorConfig.conf();
  }
}
