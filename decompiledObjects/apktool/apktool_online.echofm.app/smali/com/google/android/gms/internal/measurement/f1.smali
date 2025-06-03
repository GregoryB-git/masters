.class public final Lcom/google/android/gms/internal/measurement/f1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Ljava/lang/Object;

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;ZILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/f1;->x:Lcom/google/android/gms/internal/measurement/J0;

    const/4 p2, 0x5

    iput p2, p0, Lcom/google/android/gms/internal/measurement/f1;->s:I

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/f1;->t:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/measurement/f1;->u:Ljava/lang/Object;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f1;->v:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/f1;->w:Ljava/lang/Object;

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f1;->x:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/x0;

    iget v2, p0, Lcom/google/android/gms/internal/measurement/f1;->s:I

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/f1;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/f1;->u:Ljava/lang/Object;

    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v4

    const/4 v0, 0x0

    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v5

    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/measurement/x0;->logHealthData(ILjava/lang/String;LH2/a;LH2/a;LH2/a;)V

    return-void
.end method
