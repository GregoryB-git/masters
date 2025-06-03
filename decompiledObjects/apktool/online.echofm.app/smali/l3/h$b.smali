.class public Ll3/h$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Lc3/v;


# direct methods
.method public constructor <init>(Lc3/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/h$b;->a:Lc3/v;

    return-void
.end method

.method public synthetic constructor <init>(Lc3/v;Ll3/h$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ll3/h$b;-><init>(Lc3/v;)V

    return-void
.end method
