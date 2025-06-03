.class public final synthetic Lcom/google/android/gms/internal/measurement/U2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LW2/s;


# instance fields
.field public synthetic o:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/U2;->o:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/U2;->o:Landroid/content/Context;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/S2;->a(Landroid/content/Context;)LW2/l;

    move-result-object v0

    return-object v0
.end method
