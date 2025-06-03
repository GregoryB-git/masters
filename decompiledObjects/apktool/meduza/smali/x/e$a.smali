.class public final Lx/e$a;
.super Lp2/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public E:Lw/f$e;


# direct methods
.method public constructor <init>(Ll/b0$a;)V
    .locals 0

    invoke-direct {p0}, Lp2/m0;-><init>()V

    iput-object p1, p0, Lx/e$a;->E:Lw/f$e;

    return-void
.end method
