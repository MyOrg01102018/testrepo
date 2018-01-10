public class LogicalComponentCreationImpl extends AbstractService implements IOperationParticipant {

	
	@SuppressWarnings("rawtypes")
	@Override
	public void run(AdvisableOperation operation,
			IProcessConfigurationElement participantConfig,
			IParticipantInfoCollector collector, IProgressMonitor monitor)
			throws TeamRepositoryException {
      }
      }

 IAttribute myattr = workItemCommon.findAttribute(projectArea, IWorkItem.FOUND_IN_PROPERTY, monitor); 
                 Object myattributevalue = newState.getValue(myattr); 
