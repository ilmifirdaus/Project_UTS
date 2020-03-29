package id.ac.polinema.dapurku.ui.makanan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MakananViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MakananViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is food fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
