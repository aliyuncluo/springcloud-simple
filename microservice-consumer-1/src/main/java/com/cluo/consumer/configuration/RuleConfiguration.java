package com.cluo.consumer.configuration;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 负载均衡策略
 * @Author luolei
 * @Date 2019/7/23 15:16
 */
@Configuration
public class RuleConfiguration {

    /**
     * RandomRule 随机策略:随机选择Server
     * @return
     */
//    @Bean
//    public IRule randomRule(){
//        return new RandomRule();
//    }

    /**
     * RoundRobinRule 轮询策略：按顺序循环选择Server
     * @return
     */
    @Bean
    public IRule roundRobinRule(){
       return new RoundRobinRule();
    }

    /**
     * RetryRule 重试策略：在一个配置时间段内当选择Server不成功，则一直尝试选择一个可用的Server
     * @return
     */
//    @Bean
//    public IRule retryRule(){
//        return new RetryRule();
//    }

    /**
     * BestAvailableRule  最低并发策略：逐个考察Server,如果Server断路器打开，则忽略，再选择其中并发连接最低的Server
     * @return
     */
//    @Bean
//    public IRule bestAvailableRule(){
//        return new BestAvailableRule();
//    }

    /**
     * AvailabilityFilteringRule 可用过滤策略：过滤掉一直连接失败并被标记为circuit tripped的Server,过滤掉那些高并发连接的Server(active connections 超过配置的阈值)
     *
     * @return
     */
//    @Bean
//    public IRule availabilityFilteringRule(){
//        return new AvailabilityFilteringRule();
//    }

    /**
     * WeightedResponseTimeRule:根据Server的响应时间分配权重。
     *  响应时间越长，权重越低，被选择到的概率就越低，
     *  响应时间越短，权重越高，被选择到的概率就越高。
     * @return
     */
//    @Bean
//    public IRule weightedResponseTimeRule(){
//        return new WeightedResponseTimeRule();
//    }

    /**
     * ZoneAvoidanceRule:区域权衡策略：针对AWS
     * @return
     */
//    @Bean
//    public IRule zoneAvoidanceRule(){
//        return new ZoneAvoidanceRule();
//    }
}
