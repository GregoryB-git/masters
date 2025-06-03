.class public LD5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LD5/a$b;
    }
.end annotation


# instance fields
.field public final a:LE5/a;

.field public final b:Lio/flutter/embedding/engine/FlutterJNI;

.field public c:LD5/a$b;

.field public final d:LE5/a$d;


# direct methods
.method public constructor <init>(Lw5/a;Lio/flutter/embedding/engine/FlutterJNI;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/a$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/a$a;-><init>(LD5/a;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/a;->d:LE5/a$d;

    .line 10
    .line 11
    new-instance v1, LE5/a;

    .line 12
    .line 13
    const-string v2, "flutter/accessibility"

    .line 14
    .line 15
    sget-object v3, LE5/p;->a:LE5/p;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/a;-><init>(LE5/c;Ljava/lang/String;LE5/i;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/a;->a:LE5/a;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/a;->e(LE5/a$d;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(LD5/a;)LD5/a$b;
    .locals 0

    .line 1
    iget-object p0, p0, LD5/a;->c:LD5/a$b;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public b(ILio/flutter/view/i$g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/i$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(ILio/flutter/view/i$g;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lio/flutter/embedding/engine/FlutterJNI;->dispatchSemanticsAction(ILio/flutter/view/i$g;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public e()V
    .locals 2

    .line 1
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Lio/flutter/embedding/engine/FlutterJNI;->setSemanticsEnabled(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityFeatures(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(LD5/a$b;)V
    .locals 1

    .line 1
    iput-object p1, p0, LD5/a;->c:LD5/a$b;

    .line 2
    .line 3
    iget-object v0, p0, LD5/a;->b:Lio/flutter/embedding/engine/FlutterJNI;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lio/flutter/embedding/engine/FlutterJNI;->setAccessibilityDelegate(Lio/flutter/embedding/engine/FlutterJNI$a;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
