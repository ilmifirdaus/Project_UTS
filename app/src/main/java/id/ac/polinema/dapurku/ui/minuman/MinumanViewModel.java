package id.ac.polinema.dapurku.ui.minuman;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MinumanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MinumanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is drink fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
