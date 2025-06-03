.class public final Lb/j$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/j;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lb/j;


# direct methods
.method public constructor <init>(Lb/j;)V
    .locals 0

    iput-object p1, p0, Lb/j$d;->a:Lb/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb1/o;Lb1/k$a;)V
    .locals 0

    iget-object p1, p0, Lb/j$d;->a:Lb/j;

    invoke-virtual {p1}, Lb/j;->ensureViewModelStore()V

    iget-object p1, p0, Lb/j$d;->a:Lb/j;

    invoke-virtual {p1}, Lb/j;->getLifecycle()Lb1/k;

    move-result-object p1

    invoke-virtual {p1, p0}, Lb1/k;->c(Lb1/n;)V

    return-void
.end method
