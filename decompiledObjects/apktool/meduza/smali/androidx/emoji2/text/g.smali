.class public final Landroidx/emoji2/text/g;
.super Landroidx/emoji2/text/d$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/g$a;,
        Landroidx/emoji2/text/g$b;
    }
.end annotation


# static fields
.field public static final d:Landroidx/emoji2/text/g$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/g$a;

    invoke-direct {v0}, Landroidx/emoji2/text/g$a;-><init>()V

    sput-object v0, Landroidx/emoji2/text/g;->d:Landroidx/emoji2/text/g$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lb0/g;)V
    .locals 1

    new-instance v0, Landroidx/emoji2/text/g$b;

    invoke-direct {v0, p1, p2}, Landroidx/emoji2/text/g$b;-><init>(Landroid/content/Context;Lb0/g;)V

    invoke-direct {p0, v0}, Landroidx/emoji2/text/d$c;-><init>(Landroidx/emoji2/text/d$g;)V

    return-void
.end method
