package com.zseni.hng_task_2.presentation.featureAdd.viewModel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class EditViewModel:ViewModel() {

    var name:String by mutableStateOf("Idongesit Samuel Robson")
    var slackName:String = "Idongesit Samuel"
    //var stringResourceVariable = UiText.StringResource(R.string.personal_bio)
    var personalBio:String by mutableStateOf("I am Android Developer who is currently part of HNGx.\n" +
            "I aim to put my best foot forward in this bootcamp and get to the final stage that will be a most notable highlight of the year")
    var githubName:String = "https://github.com/idongesit98"
}



/**
 *  private val cvUseCase =  AddCvUseCase(repository)
 *     val savedStateHandle = SavedStateHandle
 *     val allItems:Flow<List<CvData>> = repository.getEvery()
 *     private val _cvName  = mutableStateOf(
 *         CvState(
 *         hint = "Enter Name"
 *     )
 *     )
 *     val cvName: State<CvState> = _cvName
 *
 *     private val _cvGit = mutableStateOf(
 *         CvState(
 *         hint = "Enter Github Link"
 *     )
 *     )
 *     val cvGit:State<CvState> = _cvGit
 *
 *     private val _cvSlack = mutableStateOf(
 *         CvState(
 *         hint = "Enter Slack Username"
 *     )
 *     )
 *     val cvSlack:State<CvState> = _cvSlack
 *
 *     private val _cvContent = mutableStateOf(
 *         CvState(
 *         hint = "Enter Correct Info"
 *     )
 *     )
 *     val cvContent:State<CvState> =_cvContent
 *
 *     private val _eventFlow = MutableSharedFlow<CvEvent>()
 *     val eventFlow = _eventFlow.asSharedFlow()
 *
 *
 *     fun onEvent(event: AddEditInput){
 *         when(event){
 *             is AddEditInput.EnteredFullName->{
 *                 _cvName.value = cvName.value.copy(
 *                     text = event.value
 *                 )
 *             }
 *
 *             is AddEditInput.ChangeFullNameFocus ->{
 *                 _cvName.value = cvName.value.copy(
 *                     isHintVisible = !event.focusState.isFocused &&
 *                     cvName.value.text.isBlank()
 *                 )
 *             }
 *
 *             is AddEditInput.EnteredSlackName ->{
 *                 _cvSlack.value = cvSlack.value.copy(
 *                     text = event.value
 *                 )
 *             }
 *
 *             is AddEditInput.ChangeSlackNameFocus ->{
 *                 _cvSlack.value = cvSlack.value.copy(
 *                     isHintVisible = !event.focusState.isFocused &&
 *                     cvSlack.value.text.isBlank()
 *                 )
 *             }
 *
 *             is AddEditInput.EnteredGitHubName ->{
 *                 _cvGit.value = cvGit.value.copy(
 *                     text = event.value
 *                 )
 *             }
 *
 *             is AddEditInput.ChangedGithubNameFocus ->{
 *                 _cvGit.value = cvGit.value.copy(
 *                     isHintVisible = !event.focusState.isFocused &&
 *                     cvGit.value.text.isBlank()
 *                 )
 *             }
 *
 *             is AddEditInput.EnteredContent ->{
 *                 _cvContent.value = cvContent.value.copy(
 *                     text = event.value
 *                 )
 *             }
 *
 *             is AddEditInput.ChangeContentFocus ->{
 *                 _cvContent.value = cvContent.value.copy(
 *                     isHintVisible = !event.focusState.isFocused &&
 *                     cvContent.value.text.isBlank()
 *                 )
 *             }
 *
 *
 *             is AddEditInput.SaveData ->{
 *                 viewModelScope.launch {
 *                     try {
 *                         cvUseCase(
 *                             CvData(
 *                                 fullName = cvName.value.text,
 *                                 personalBio = cvContent.value.text,
 *                                 slackUsername = cvSlack.value.text,
 *                                 githubName = cvGit.value.text
 *                             )
 *                         )
 *                     }catch (e:InvalidCvDataException){
 *                         _eventFlow.emit(
 *                             CvEvent.ShowSnackBar(
 *                                 message = e.message ?: "Couldn't Save Data"
 *                             )
 *                         )
 *
 *                     }
 *                 }
 *             }
 *
 *         }
 *     }
 *
 *     sealed class CvEvent{
 *         data class ShowSnackBar(val message:String): CvEvent()
 *         object SaveData: CvEvent()
 *     }
 *
 */