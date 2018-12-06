/**
 * 责任链模式（一）
 * 
 * <pre>
 * 软件公司承接了某企业SCM(Supply Chain Management，供应链管理)系统的开发任务，其中包含一个采购审批子系统。
 * 该企业的采购审批是分级进行的，即根据采购金额的不同由不同层次的主管人员来审批，
 * 主任可以审批5万元以下（不包括5万元）的采购单，
 * 副董事长可以审批5万元至10万元（不包括10万元）的采购单，
 * 董事长可以审批10万元至50万元（不包括50万元）的采购单，
 * 50万元及以上的采购单就需要开董事会讨论决定。
 * 
 * 软件公司开发人员提出了一个初始解决方案，在系统中提供一个采购单处理类PurchaseRequestHandler用于统一处理采购单
 * 
 * 上述方案存在如下几个问题：
 * 
 *  (1)PurchaseRequestHandler类较为庞大，各个级别的审批方法都集中在一个类中，违反了“单一职责原则”，测试和维护难度大。
 *  
 *  (2)如果需要增加一个新的审批级别或调整任何一级的审批金额和审批细节（例如将董事长的审批额度改为60万元）时都必须修改源代码并进行严格测试，
 *      此外，如果需要移除某一级别（例如金额为10万元及以上的采购单直接由董事长审批，不再设副董事长一职）时也必须对源代码进行修改，违反了“开闭原则”。
 *      
 *  (3)审批流程的设置缺乏灵活性，现在的审批流程是“主任-->副董事长-->董事长-->董事会”，如果需要改为“主任-->董事长-->董事会”，
 *      在此方案中只能通过修改源代码来实现，客户端无法定制审批流程。
 *      
 * 通过使用责任链模式我们可以最大程度地解决这些问题
 * </pre>
 *
 * @author colg
 */
package cn.colg.example._01;