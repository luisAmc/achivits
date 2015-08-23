frame = luajava.newInstance( "javax.swing.JFrame", "Suma");
pane = luajava.newInstance( "javax.swing.JPanel" );
borderFactory = luajava.bindClass( "javax.swing.BorderFactory" )
border = borderFactory:createEmptyBorder( 112, 102, 75, 25 )
pane:setBorder( border )

firstNumber = luajava.newInstance("javax.swing.JSpinner", 0);
secondNumber = luajava.newInstance("javax.swing.JSpinner", 0);
numberModel1 = luajava.newInstance("javax.swing.SpinnerNumberModel");
numberModel2 = luajava.newInstance("javax.swing.SpinnerNumberModel");
firstNumber:setModel(numberModel1);
secondNumber:setModel(numberModel2);

addLabel = luajava.newInstance("javax.swing.JLabel", "+");

addButton = luajava.newInstance("javax.swing.JButton");
addButton:setText("Add");
closeButton = luajava.newInstance("javax.swing.JButton");
closeButton:setText("Close");

result = firstNumber:getValue() + secondNumber:getValue();

resultLabel = luajava.newInstance( "javax.swing.JLabel");
resultLabel:setText(result);

--Setting bounds
firstNumber:setBounds(10, 24, 72, 20);
secondNumber:setBounds(110, 24, 67, 20);
addLabel:setBounds(92, 27, 8, 14);
resultLabel:setBounds(20, 60, 32, 14);
addButton:setBounds(20, 100, 70, 23);
closeButton:setBounds(110, 100, 70, 23);

layout = luajava.newInstance("org.netbeans.lib.awtextra.AbsoluteLayout");
frame:getContentPane():setLayout(layout);
pane:setLayout(null);
pane:add(firstNumber);
pane:add(addLabel);
pane:add(secondNumber);
pane:add(resultLabel);
pane:add(addButton);
pane:add(closeButton);

constrains = luajava.newInstance("org.netbeans.lib.awtextra.AbsoluteConstraints", 0, 0, 190, 130);
borderLayout = luajava.bindClass( "java.awt.BorderLayout" );
frame:getContentPane():add(pane, constrains );
frame:getContentPane():setBounds(112, 102, 75, 25);
jframe = luajava.bindClass( "javax.swing.JFrame" );
frame:setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
frame:pack();
frame:setVisible(true);

addListener = luajava.createProxy("java.awt.event.MouseListener",
{
    mouseClicked = function(evt)
        result = firstNumber:getValue() + secondNumber:getValue();
        resultLabel:setText(result); 
    end
});
addButton:addMouseListener(addListener);

closeListener = luajava.createProxy("java.awt.event.MouseListener",
{
    mouseClicked = function(evt)
        frame:dispose();
    end
});
closeButton:addMouseListener(closeListener);

local listener = luajava.createProxy("java.awt.event.MouseListener",
{
    mouseClicked = function(me)
        print("clicked!", me)
    end
});

frame:addMouseListener(listener);