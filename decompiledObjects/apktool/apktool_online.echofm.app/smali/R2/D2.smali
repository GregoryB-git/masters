.class public final LR2/D2;
.super Lt/g;
.source "SourceFile"


# instance fields
.field public final synthetic i:LR2/x2;


# direct methods
.method public constructor <init>(LR2/x2;I)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/D2;->i:LR2/x2;

    .line 2
    .line 3
    const/16 p1, 0x14

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lt/g;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {p1}, LA2/n;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LR2/D2;->i:LR2/x2;

    .line 7
    .line 8
    invoke-static {v0, p1}, LR2/x2;->B(LR2/x2;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/C;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method
