.class public final Lcom/google/android/gms/internal/measurement/n1;
.super Lcom/google/android/gms/internal/measurement/J0$a;
.source "SourceFile"


# instance fields
.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/Object;

.field public final synthetic v:Z

.field public final synthetic w:Lcom/google/android/gms/internal/measurement/J0;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/measurement/J0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/n1;->w:Lcom/google/android/gms/internal/measurement/J0;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/n1;->s:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/n1;->t:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/measurement/n1;->u:Ljava/lang/Object;

    iput-boolean p5, p0, Lcom/google/android/gms/internal/measurement/n1;->v:Z

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/J0$a;-><init>(Lcom/google/android/gms/internal/measurement/J0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n1;->w:Lcom/google/android/gms/internal/measurement/J0;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/J0;->d(Lcom/google/android/gms/internal/measurement/J0;)Lcom/google/android/gms/internal/measurement/x0;

    move-result-object v0

    invoke-static {v0}, LA2/n;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/google/android/gms/internal/measurement/x0;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/n1;->s:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/measurement/n1;->t:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/n1;->u:Ljava/lang/Object;

    invoke-static {v0}, LH2/b;->Z0(Ljava/lang/Object;)LH2/a;

    move-result-object v4

    iget-boolean v5, p0, Lcom/google/android/gms/internal/measurement/n1;->v:Z

    iget-wide v6, p0, Lcom/google/android/gms/internal/measurement/J0$a;->o:J

    invoke-interface/range {v1 .. v7}, Lcom/google/android/gms/internal/measurement/x0;->setUserProperty(Ljava/lang/String;Ljava/lang/String;LH2/a;ZJ)V

    return-void
.end method
