package com.bracketcove.postrainer.usecase;

import com.bracketcove.postrainer.data.reminder.ReminderService;
import com.bracketcove.postrainer.data.viewmodel.Reminder;

import io.reactivex.Observable;

/**
 * Created by R_KAY on 5/23/2017.
 */

public class DeleteReminder implements ReminderUseCase {

    private final ReminderService reminderService;

    public DeleteReminder(ReminderService reminderService) {
        this.reminderService = reminderService;
    }

    @Override
    public Observable runUseCase(Reminder reminder) {
        return reminderService.deleteReminder(reminder);
    }
}
