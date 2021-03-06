package org.muml.storydiagram.interpreter.core.mdelab.notifications;

/**
 * A NotificationReceiver can receive notifications from a NotificationEmitter.
 * 
 * @author Stephan Hildebrandt
 * 
 * @param <Classifier>
 */
public interface NotificationReceiver<Classifier>
{
	/**
	 * Receive a notification.
	 * 
	 * @param notification
	 */
	public void notifyChanged(InterpreterNotification<Classifier> notification);
}
