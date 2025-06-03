.class public Lcom/google/android/datatransport/cct/CctBackendFactory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Ll3/h;)Ll3/m;
    .locals 3

    new-instance v0, Li3/b;

    invoke-virtual {p1}, Ll3/h;->a()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Ll3/h;->d()Lt3/a;

    move-result-object v2

    invoke-virtual {p1}, Ll3/h;->c()Lt3/a;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Li3/b;-><init>(Landroid/content/Context;Lt3/a;Lt3/a;)V

    return-object v0
.end method
