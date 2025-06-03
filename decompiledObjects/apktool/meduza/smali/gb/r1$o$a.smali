.class public final Lgb/r1$o$a;
.super Lgb/d1$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgb/r1$o;->h(Leb/k0$k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation


# instance fields
.field public final synthetic a:Leb/k0$k;

.field public final synthetic b:Lgb/r1$o;


# direct methods
.method public constructor <init>(Lgb/r1$o;Leb/k0$k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lgb/r1$o$a;->b:Lgb/r1$o;

    iput-object p2, p0, Lgb/r1$o$a;->a:Leb/k0$k;

    invoke-direct {p0}, Lgb/d1$c;-><init>()V

    return-void
.end method
