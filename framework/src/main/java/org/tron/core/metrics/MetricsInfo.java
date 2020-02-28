package org.tron.core.metrics;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.extern.slf4j.Slf4j;
import org.tron.core.metrics.blockchain.BlockChainInfo;
import org.tron.core.metrics.net.NetInfo;
import org.tron.core.metrics.node.NodeInfo;

@Slf4j
public class MetricsInfo {
  private long startTime;

  private NodeInfo node;

  private BlockChainInfo blockchain;

  private NetInfo net;

  public long getStartTime() {
    return startTime;
  }

  public void setStartTime(long startTime) {
    this.startTime = startTime;
  }

  @JSONField(name = "node")
  public NodeInfo getNodeInfo() {
    return this.node;
  }


  public void setNodeInfo(NodeInfo node) {
    this.node = node;
  }

  @JSONField(name = "blockchain")
  public BlockChainInfo getBlockChainInfo() {
    return this.blockchain;
  }

  public void setBlockChainInfo(BlockChainInfo blockChain) {
    this.blockchain = blockChain;
  }


  public NetInfo getNet() {
    return net;
  }

  public void setNet(NetInfo net) {
    this.net = net;
  }
}
