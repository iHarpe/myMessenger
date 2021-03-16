package co.edu.unipiloto.mymessenger;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class ReceiveMessageActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent=getIntent();
        String messageText=intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView=(TextView)findViewById(R.id.message);
        messageView.setText(messageText);
    }
    public void onSendMessage(View view){
        EditText messageView=(EditText) findViewById(R.id.messages);
        String messageText=messageView.getText().toString();
        Intent intent=new Intent(this, CreateMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);
        startActivity(intent);
    }

}