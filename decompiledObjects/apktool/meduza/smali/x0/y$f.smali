.class public final Lx0/y$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx0/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lx0/y;


# direct methods
.method public constructor <init>(Lx0/y;)V
    .locals 0

    iput-object p1, p0, Lx0/y$f;->a:Lx0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx0/y$f;->a:Lx0/y;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lx0/y;->A(Z)Z

    return-void
.end method
