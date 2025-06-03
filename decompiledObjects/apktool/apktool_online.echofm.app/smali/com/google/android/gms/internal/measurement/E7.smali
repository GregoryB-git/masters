.class public final Lcom/google/android/gms/internal/measurement/E7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/s;


# static fields
.field public static p:Lcom/google/android/gms/internal/measurement/E7;


# instance fields
.field public final o:LW2/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/measurement/E7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/E7;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/measurement/E7;->p:Lcom/google/android/gms/internal/measurement/E7;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/measurement/G7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/measurement/G7;-><init>()V

    invoke-static {v0}, LW2/t;->b(Ljava/lang/Object;)LW2/s;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/measurement/E7;->o:LW2/s;

    return-void
.end method

.method public static a()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/E7;->p:Lcom/google/android/gms/internal/measurement/E7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/E7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/D7;->a()Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/E7;->p:Lcom/google/android/gms/internal/measurement/E7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/E7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/D7;->b()Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/measurement/E7;->p:Lcom/google/android/gms/internal/measurement/E7;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/E7;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D7;

    invoke-interface {v0}, Lcom/google/android/gms/internal/measurement/D7;->c()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final synthetic get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/E7;->o:LW2/s;

    invoke-interface {v0}, LW2/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/D7;

    return-object v0
.end method
