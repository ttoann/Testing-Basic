package com.example.android.architecture.blueprints.todoapp.tasks

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android.architecture.blueprints.todoapp.getOrAwaitValue
import org.hamcrest.CoreMatchers.*
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@Config(sdk = [30]) // Remove when Robolectric supports SDK 31
@RunWith(AndroidJUnit4::class)
class TasksViewModelTest {

    // Subject under test
    private lateinit var tasksViewModel: TasksViewModel

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Before
    fun setupViewModel() {
        tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
    }

      // Task 4: Setting up a ViewModel Test with AndroidX Test
//    @Test
//    fun addNewTask_setsNewTaskEvent() {
//
//        // Given a fresh ViewModel
//        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
//
//        // When adding a new task
//        tasksViewModel.addNewTask()
//
//        // Then the new task event is triggered
//        // TODO test LiveData
//    }

      // Task 5: Writing Assertions for LiveData
//    @Test
//    fun addNewTask_setsNewTaskEvent() {
//
//        // Given a fresh ViewModel
//        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())
//
//        // When adding a new task
//        tasksViewModel.addNewTask()
//
//        // Then the new task event is triggered
//        val value = tasksViewModel.newTaskEvent.getOrAwaitValue()
//        assertThat(value.getContentIfNotHandled(), (not(nullValue())))
//    }

    // Task 6: Writing multiple ViewModel tests
    @Test
    fun setFilterAllTasks_tasksAddViewVisible() {

        // Given a fresh ViewModel
        val tasksViewModel = TasksViewModel(ApplicationProvider.getApplicationContext())

        // When the filter type is ALL_TASKS
        tasksViewModel.setFiltering(TasksFilterType.ALL_TASKS)

        // Then the "Add task" action is visible
        assertThat(tasksViewModel.tasksAddViewVisible.getOrAwaitValue(), `is`(true))
    }
}