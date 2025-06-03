.class public final enum Lb1/k$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb1/k$a$a;,
        Lb1/k$a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb1/k$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lb1/k$a;

.field public static final Companion:Lb1/k$a$a;

.field public static final enum ON_ANY:Lb1/k$a;

.field public static final enum ON_CREATE:Lb1/k$a;

.field public static final enum ON_DESTROY:Lb1/k$a;

.field public static final enum ON_PAUSE:Lb1/k$a;

.field public static final enum ON_RESUME:Lb1/k$a;

.field public static final enum ON_START:Lb1/k$a;

.field public static final enum ON_STOP:Lb1/k$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 15

    new-instance v0, Lb1/k$a;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lb1/k$a;->ON_CREATE:Lb1/k$a;

    new-instance v1, Lb1/k$a;

    const-string v3, "ON_START"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lb1/k$a;->ON_START:Lb1/k$a;

    new-instance v3, Lb1/k$a;

    const-string v5, "ON_RESUME"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lb1/k$a;->ON_RESUME:Lb1/k$a;

    new-instance v5, Lb1/k$a;

    const-string v7, "ON_PAUSE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lb1/k$a;->ON_PAUSE:Lb1/k$a;

    new-instance v7, Lb1/k$a;

    const-string v9, "ON_STOP"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lb1/k$a;->ON_STOP:Lb1/k$a;

    new-instance v9, Lb1/k$a;

    const-string v11, "ON_DESTROY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lb1/k$a;->ON_DESTROY:Lb1/k$a;

    new-instance v11, Lb1/k$a;

    const-string v13, "ON_ANY"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lb1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lb1/k$a;->ON_ANY:Lb1/k$a;

    const/4 v13, 0x7

    new-array v13, v13, [Lb1/k$a;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lb1/k$a;->$VALUES:[Lb1/k$a;

    new-instance v0, Lb1/k$a$a;

    invoke-direct {v0}, Lb1/k$a$a;-><init>()V

    sput-object v0, Lb1/k$a;->Companion:Lb1/k$a$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb1/k$a;
    .locals 1

    const-class v0, Lb1/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb1/k$a;

    return-object p0
.end method

.method public static values()[Lb1/k$a;
    .locals 1

    sget-object v0, Lb1/k$a;->$VALUES:[Lb1/k$a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb1/k$a;

    return-object v0
.end method


# virtual methods
.method public final f()Lb1/k$b;
    .locals 3

    sget-object v0, Lb1/k$a$b;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " has no target state"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object v0, Lb1/k$b;->a:Lb1/k$b;

    return-object v0

    :pswitch_1
    sget-object v0, Lb1/k$b;->e:Lb1/k$b;

    return-object v0

    :pswitch_2
    sget-object v0, Lb1/k$b;->d:Lb1/k$b;

    return-object v0

    :pswitch_3
    sget-object v0, Lb1/k$b;->c:Lb1/k$b;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
