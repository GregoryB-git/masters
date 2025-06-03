.class public final Ll/n0$d;
.super Landroid/database/DataSetObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic a:Ll/n0;


# direct methods
.method public constructor <init>(Ll/n0;)V
    .locals 0

    iput-object p1, p0, Ll/n0$d;->a:Ll/n0;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 1

    iget-object v0, p0, Ll/n0$d;->a:Ll/n0;

    invoke-virtual {v0}, Ll/n0;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/n0$d;->a:Ll/n0;

    invoke-virtual {v0}, Ll/n0;->show()V

    :cond_0
    return-void
.end method

.method public final onInvalidated()V
    .locals 1

    iget-object v0, p0, Ll/n0$d;->a:Ll/n0;

    invoke-virtual {v0}, Ll/n0;->dismiss()V

    return-void
.end method
