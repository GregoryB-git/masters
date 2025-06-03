.class public final synthetic Lp4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV2/g;


# instance fields
.field public final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final b:Lcom/google/firebase/iid/b$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Lcom/google/firebase/iid/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/i;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 5
    .line 6
    iput-object p2, p0, Lp4/i;->b:Lcom/google/firebase/iid/b$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp4/i;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/i;->b:Lcom/google/firebase/iid/b$a;

    .line 4
    .line 5
    check-cast p1, Lp4/l;

    .line 6
    .line 7
    invoke-virtual {v0, v1, p1}, Lcom/google/firebase/iid/FirebaseInstanceId;->x(Lcom/google/firebase/iid/b$a;Lp4/l;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
