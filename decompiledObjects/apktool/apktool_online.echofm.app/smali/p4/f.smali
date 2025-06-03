.class public final synthetic Lp4/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/iid/a$a;


# instance fields
.field public final a:Lcom/google/firebase/iid/FirebaseInstanceId;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Lcom/google/firebase/iid/b$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/iid/FirebaseInstanceId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/iid/b$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp4/f;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 5
    .line 6
    iput-object p2, p0, Lp4/f;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lp4/f;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p4, p0, Lp4/f;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lp4/f;->e:Lcom/google/firebase/iid/b$a;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public start()LV2/j;
    .locals 5

    .line 1
    iget-object v0, p0, Lp4/f;->a:Lcom/google/firebase/iid/FirebaseInstanceId;

    .line 2
    .line 3
    iget-object v1, p0, Lp4/f;->b:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lp4/f;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lp4/f;->d:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lp4/f;->e:Lcom/google/firebase/iid/b$a;

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/firebase/iid/FirebaseInstanceId;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/firebase/iid/b$a;)LV2/j;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method
