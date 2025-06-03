.class public final Lk4/a$b;
.super Lk4/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final b:Lv5/u;


# direct methods
.method public constructor <init>(ILv5/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lk4/a;-><init>(I)V

    iput-object p2, p0, Lk4/a$b;->b:Lv5/u;

    return-void
.end method
